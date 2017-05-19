/**
 * user login operation
 */
var login = {
	init : function() {
		// do nothing;
	},
	signIn:function(){
		$.ajax({
            type: "POST",
            url: base_url+'theta-framework/userLogin/login',
            data:
            {
	            'userId':"aaa"
			 },
            dataType: "json",
            success: function(resp){
            	debugger;
               if(resp)
               {
               	if(0!=resp.code){
               		alert("login success");
               	}
               	else{
               		// reload
               		//location.reload(); 
               	}
               }
            },
            error:function(resp){
            	
            }
        }).done(function(resp){
        	alert(resp);
       });
	}
}