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
            sync:'true',
            success: function(resp){
            	debugger;
               if(resp)
               {
               	if(0==resp.code){
               		//alert("login success");
               		//window.open(base_url+'theta-framework/userLogin/'+resp.msg);
               		var ctx = $('#ctx').val();
               		//window.location.href= ctx+'/'+resp.data;
               		window.location.href=base_url+'theta-framework/'+resp.data;
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
        	//alert(resp);
       });
	}
}