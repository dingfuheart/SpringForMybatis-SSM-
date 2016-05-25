$(function() {
	
	$("#AddUser").click(function() {
		var params = {
				"ID" : 5
			};
			$.ajax({
				url : "user/deleteUser.do",
				type : "post",
				data : params,
				dataType : "json",
				success : function(data) {
					if (data.msg == "success") {
						// alert("添加用户成功！");
						showTips("删除用户成功！",1000,true)
					}
					
					if (data.msg == "error") {
						// alert("添加用户失败！");
						showTips("删除用户成功！",1000,false)
					}
				}
			});
	});
});