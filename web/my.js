var user={
		query:function(){
			utils.ajax({},"showemp",
					function(data){
						var info= "<table border=1>";
						for(var i=0;i<data.empinfo.length;i++)
						{
								info = info+"<tr><td>"+data.empinfo[i].id+"</td><td>"+data.empinfo[i].name+"</td><td><input type=button id=delete value=delete onclick=user.del("+data.empinfo[i].id+")></td></tr>";
						}
						
						info = info+"</table>";
						$("#empinfo").html(info);
					}
			);
			
		},
		del:function(id)
		{
			utils.ajax({id:id},"delemp",function(data){
				if(data.status==200)
				{
					window.location.href="index.jsp";
				}
				else
				{
					alert("现在系统处于维护阶段，请稍后再试");
				}
			});
		}
}
var utils={
	ajax:function(data,url,func)
	{
		$.ajax({
			data:data,
			dataType:"json",
			type:"get",
			url:url,
			success:func
		});
	}
}