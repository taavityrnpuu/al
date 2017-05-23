package ee.agri.alkor.service;

import ee.agri.alkor.model.IEntity;
/**
 * 
 * @author ivar
 *
 */
public interface IBaseService   {

	IEntity saveOrUpdate(IEntity obj) throws ConstraintViolationException ;
	
	SearchFilter search(SearchFilter filter);
   SearchFilter searchApplications(SearchFilter filter) ;
}
