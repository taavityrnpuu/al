package ee.agri.alkor.web.server;

import ee.agri.alkor.impl.ResultSet;
import java.util.Date;

import ee.agri.alkor.impl.PostgreUtils;

public class UserAuthlog {
	private String idCode;
	private long id = 0;
	private Date created;
	private Date lastLogin;
	private String name;
	private boolean isNew;	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the idCode
	 */
	public String getIdCode() {
		return idCode;
	}

	/**
	 * @param idCode
	 *            the idCode to set
	 */
	public void setIdCode(String idCode) {
		this.idCode = idCode;
	}
	

	/**
	 * @return the isNew
	 */
	public boolean isNew() {
		return isNew;
	}

	/**
	 * @param isNew the isNew to set
	 */
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public UserAuthlog(String idCode) {
		setIdCode(idCode);		
	}
	
	public UserAuthlog(String idCode, String name) {
		setIdCode(idCode);		
		setName(name);
	}
	
	public boolean checkAndCreate(){		
		String sql = "select * from user_authlog where id_code = '"+getIdCode()+"'";
		
		try{
			ResultSet res = PostgreUtils.query(sql);		
			
			while(res.next()){
				setId(res.getLong("id"));
				setCreated(res.getDate("created"));
				setLastLogin(res.getDate("last_login"));
				setName(res.getString("name"));
			}
			
			if(getId() == 0){
				//insert
				sql = "INSERT INTO user_authlog(id_code, name) VALUES ('"+getIdCode()+"', '"+getName()+"')";
				Long newId = PostgreUtils.insert(sql, "id");
				if(newId == 0){
					return false;
				}
				setNew(true);
			} else {
				//update
				sql = "UPDATE user_authlog set last_login = NOW() where id_code = '"+getIdCode()+"'";
				setNew(false);
				return !PostgreUtils.update(sql);				
			}
		} catch (Exception ex){
			ex.printStackTrace();
			return false;
		}
		
		return true;
	}
	
}
