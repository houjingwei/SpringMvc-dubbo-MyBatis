<html>
<head>
    <title>首页</title>
    <@h.head />
</head>
<title>Insert title here</title>
</head>
<body class="fixed-sidebar full-height-layout gray-bg"
	style="overflow: hidden">
	<div id="wrapper">
		
		<@h.left />
		
		
		<!--右侧部分开始-->
		<div id="page-wrapper" class="gray-bg dashbard-1">
			
			<@h.top />
			
			<div class="row J_mainContent" id="content-main" style="OVERFLOW-Y: scroll;scrollbar-face-color:#B3DDF7;scrollbar-shadow-color:#B3DDF7;" >
				
                  <div class="wrapper wrapper-content animated fadeInRight" >
                    
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="ibox float-e-margins">
                                <div class="ibox-content">
                                    <table data-toggle="table" id="table" >
								            <thead>
								            </thead>
									</table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
			</div>
			<@h.fotter />
		</div>
		

	</div>
	<script>
		$('#table').bootstrapTable({
            url: '${path}/admin/roles',
            striped: true,
            pagination: true,
            pageList: [3,5,20],
            pageSize:3,
            pageNumber:1,
            sidePagination:'server',//设置为服务器端分页
            columns: [{
                field: 'remark',
                title: '标题'
            }, {
                field: 'remark',
                title: '时间'
            } ]
        });
	</script>

</body>
</html>
