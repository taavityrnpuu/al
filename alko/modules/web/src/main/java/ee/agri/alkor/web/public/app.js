post = function(url, data) {
    return new Promise(function(resolve, reject) {
        $.ajax({
            dataType: "json",
            url: url,
            type: "POST",
            data: data
        }).done(function(data) {
            if(data.result != "ok") {
                reject(Error(data.result))
            } else {
                resolve(data);
            }
        }).fail(function() {
            reject(Error("Post operation failed"));
        });
    });
};

generateContainer = function(certInHex) {
    return post("generateContainer", {certInHex: certInHex})
};

finalizeSigning = function(signatureInHex, docId, signatureId, containerId) {
    return post("finalizeSigning", {signatureInHex: signatureInHex, docId: docId, signatureId: signatureId, containerId: containerId});
};

sign = function(docId) {
    var hwcCertificate; 
    var signatureId;
    var containerId;
    var isError = false;
    
    try {    	  
	    window.hwcrypto.getCertificate({lang: 'en'})
	    	.then(
		    	function(certificate) {
		    		console.log("----- 1 -----");
		    		console.log(certificate);
		    		
		    		hwcCertificate = certificate;     
		    		return generateContainer(certificate.hex);
		    	}, 
		    	function(r) {showError(1, r); isError = true;}
	    	).then(
	    		function(response) {
	    			if(!isError){
			    		console.log("----- 2 -----");
			    		console.log(response);
			    		
	    				signatureId = response.generatedSignatureId;
	    				containerId = response.containerId;
	    				
	    	            var dataToSignHash = new Uint8Array(base64js.toByteArray(response.dataToSignHash));
	    				return window.hwcrypto.sign(hwcCertificate, {type: response.digestAlgorithm, value: dataToSignHash}, {lang: 'en'});
	    			}
	    		},
	    		function(r) {showError(2, r); isError = true;}
	    	).then(
    			function(signature) {
    				if(!isError){
    		    		console.log("----- 3 -----");
    		    		console.log(signature);
    		    		
    					return finalizeSigning(signature.hex, docId, signatureId, containerId);
    				}
    			}, 
    			function(r) {showError(3, r); isError = true;}
			).then(
				function(result) {
					if(!isError){
			    		console.log("----- 4 -----");
			    		console.log(result);
			    		
						showSuccess();
					}
				},
				function(r) {showError(4, r); isError = true;}
			);
    } catch (x) {
    	showError(5,x);
    }
};

