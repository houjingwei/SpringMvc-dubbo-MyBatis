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
                                <div class="ibox-title">
                                    <h5>
                                        基本 <small>分类，查找</small>
                                    </h5>
                                    <div class="ibox-tools">
                                        <a class="collapse-link"> <i class="fa fa-chevron-up"></i>
                                        </a> <a href="table_data_tables.html#" data-toggle="dropdown"
                                            class="dropdown-toggle"> <i class="fa fa-wrench"></i>
                                        </a>
                                        <ul class="dropdown-menu dropdown-user">
                                            <li><a href="table_data_tables.html#">选项1</a></li>
                                            <li><a href="table_data_tables.html#">选项2</a></li>
                                        </ul>
                                        <a class="close-link"> <i class="fa fa-times"></i>
                                        </a>
                                    </div>
                                </div>
                                <div class="ibox-content">

                                    <div role="grid" class="dataTables_wrapper form-inline"
                                        id="DataTables_Table_0_wrapper">
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <div class="dataTables_length"
                                                    id="DataTables_Table_0_length">
                                                    <label>每页 <select name="DataTables_Table_0_length"
                                                        aria-controls="DataTables_Table_0"
                                                        class="form-control input-sm"><option value="10">10</option>
                                                            <option value="25">25</option>
                                                            <option value="50">50</option>
                                                            <option value="100">100</option></select> 条记录
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="col-sm-6">
                                                <div id="DataTables_Table_0_filter"
                                                    class="dataTables_filter">
                                                    <label>查找：<input type="search"
                                                        class="form-control input-sm"
                                                        aria-controls="DataTables_Table_0"></label>
                                                </div>
                                            </div>
                                        </div>
                                        <table
                                            class="table table-striped table-bordered table-hover dataTables-example dataTable"
                                            id="DataTables_Table_0"
                                            aria-describedby="DataTables_Table_0_info">
                                            <thead>
                                                <tr role="row">
                                                    <th class="sorting_asc" tabindex="0"
                                                        aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
                                                        style="width: 218px;" aria-sort="ascending"
                                                        aria-label="渲染引擎：激活排序列升序">渲染引擎</th>
                                                    <th class="sorting" tabindex="0"
                                                        aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
                                                        style="width: 380px;" aria-label="浏览器：激活排序列升序">浏览器</th>
                                                    <th class="sorting" tabindex="0"
                                                        aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
                                                        style="width: 355px;" aria-label="平台：激活排序列升序">平台</th>
                                                    <th class="sorting" tabindex="0"
                                                        aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
                                                        style="width: 153px;" aria-label="引擎版本：激活排序列升序">引擎版本</th>
                                                    <th class="sorting" tabindex="0"
                                                        aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
                                                        style="width: 154px;" aria-label="CSS等级：激活排序列升序">CSS等级</th>
                                                </tr>
                                            </thead>
                                            <tbody>

                                                <tr class="gradeA even">
                                                    <td class="sorting_1">Gecko</td>
                                                    <td class=" ">Netscape Browser 8</td>
                                                    <td class=" ">Win 98SE+</td>
                                                    <td class="center ">1.7</td>
                                                    <td class="center ">A</td>
                                                </tr>
                                                <tr class="gradeA odd">
                                                    <td class="sorting_1">Gecko</td>
                                                    <td class=" ">Netscape Navigator 9</td>
                                                    <td class=" ">Win 98+ / OSX.2+</td>
                                                    <td class="center ">1.8</td>
                                                    <td class="center ">A</td>
                                                </tr>
                                                <tr class="gradeA even">
                                                    <td class="sorting_1">Gecko</td>
                                                    <td class=" ">Mozilla 1.0</td>
                                                    <td class=" ">Win 95+ / OSX.1+</td>
                                                    <td class="center ">1</td>
                                                    <td class="center ">A</td>
                                                </tr>
                                            </tbody>
                                            <tfoot>
                                                <tr>
                                                    <th rowspan="1" colspan="1">渲染引擎</th>
                                                    <th rowspan="1" colspan="1">浏览器</th>
                                                    <th rowspan="1" colspan="1">平台</th>
                                                    <th rowspan="1" colspan="1">引擎版本</th>
                                                    <th rowspan="1" colspan="1">CSS等级</th>
                                                </tr>
                                            </tfoot>
                                        </table>
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <div class="dataTables_info" id="DataTables_Table_0_info"
                                                    role="alert" aria-live="polite" aria-relevant="all">显示
                                                    1 到 10 项，共 57 项</div>
                                            </div>
                                            <div class="col-sm-6">
                                                <div class="dataTables_paginate paging_simple_numbers"
                                                    id="DataTables_Table_0_paginate">
                                                    <ul class="pagination">
                                                        <li class="paginate_button previous disabled"
                                                            aria-controls="DataTables_Table_0" tabindex="0"
                                                            id="DataTables_Table_0_previous"><a href="#">上一页</a></li>
                                                        <li class="paginate_button active"
                                                            aria-controls="DataTables_Table_0" tabindex="0"><a
                                                            href="#">1</a></li>
                                                        <li class="paginate_button "
                                                            aria-controls="DataTables_Table_0" tabindex="0"><a
                                                            href="#">2</a></li>
                                                        <li class="paginate_button "
                                                            aria-controls="DataTables_Table_0" tabindex="0"><a
                                                            href="#">3</a></li>
                                                        <li class="paginate_button "
                                                            aria-controls="DataTables_Table_0" tabindex="0"><a
                                                            href="#">4</a></li>
                                                        <li class="paginate_button "
                                                            aria-controls="DataTables_Table_0" tabindex="0"><a
                                                            href="#">5</a></li>
                                                        <li class="paginate_button "
                                                            aria-controls="DataTables_Table_0" tabindex="0"><a
                                                            href="#">6</a></li>
                                                        <li class="paginate_button next"
                                                            aria-controls="DataTables_Table_0" tabindex="0"
                                                            id="DataTables_Table_0_next"><a href="#">下一页</a></li>
                                                    </ul>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="ibox float-e-margins">
                                <div class="ibox-title">
                                    <h5>可编辑表格</h5>
                                    <div class="ibox-tools">
                                        <a class="collapse-link"> <i class="fa fa-chevron-up"></i>
                                        </a> <a href="table_data_tables.html#" data-toggle="dropdown"
                                            class="dropdown-toggle"> <i class="fa fa-wrench"></i>
                                        </a>
                                        <ul class="dropdown-menu dropdown-user">
                                            <li><a href="table_data_tables.html#">选项1</a></li>
                                            <li><a href="table_data_tables.html#">选项2</a></li>
                                        </ul>
                                        <a class="close-link"> <i class="fa fa-times"></i>
                                        </a>
                                    </div>
                                </div>
                                <div class="ibox-content">
                                    <div class="">
                                        <a class="btn btn-primary " href="javascript:void(0);"
                                            onclick="fnClickAddRow();">添加行</a>
                                    </div>
                                    <div role="grid" class="dataTables_wrapper form-inline"
                                        id="editable_wrapper">
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <div class="dataTables_length" id="editable_length">
                                                    <label>每页 <select name="editable_length"
                                                        aria-controls="editable" class="form-control input-sm"><option
                                                                value="10">10</option>
                                                            <option value="25">25</option>
                                                            <option value="50">50</option>
                                                            <option value="100">100</option></select> 条记录
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="col-sm-6">
                                                <div id="editable_filter" class="dataTables_filter">
                                                    <label>查找：<input type="search"
                                                        class="form-control input-sm" aria-controls="editable"></label>
                                                </div>
                                            </div>
                                        </div>
                                        <table id="editable"
                                            class="table table-striped table-bordered table-hover  dataTable"
                                            aria-describedby="editable_info">
                                            <thead>
                                                <tr role="row">
                                                    <th class="sorting_asc" tabindex="0"
                                                        aria-controls="editable" rowspan="1" colspan="1"
                                                        style="width: 218px;" aria-sort="ascending"
                                                        aria-label="渲染引擎：激活排序列升序">渲染引擎</th>
                                                    <th class="sorting" tabindex="0" aria-controls="editable"
                                                        rowspan="1" colspan="1" style="width: 380px;"
                                                        aria-label="浏览器：激活排序列升序">浏览器</th>
                                                    <th class="sorting" tabindex="0" aria-controls="editable"
                                                        rowspan="1" colspan="1" style="width: 355px;"
                                                        aria-label="平台：激活排序列升序">平台</th>
                                                    <th class="sorting" tabindex="0" aria-controls="editable"
                                                        rowspan="1" colspan="1" style="width: 153px;"
                                                        aria-label="引擎版本：激活排序列升序">引擎版本</th>
                                                    <th class="sorting" tabindex="0" aria-controls="editable"
                                                        rowspan="1" colspan="1" style="width: 154px;"
                                                        aria-label="CSS等级：激活排序列升序">CSS等级</th>
                                                </tr>
                                            </thead>
                                            <tbody>

                                                <tr class="gradeA odd">
                                                    <td class="sorting_1">Gecko</td>
                                                    <td class=" ">Firefox 1.0</td>
                                                    <td class=" ">Win 98+ / OSX.2+</td>
                                                    <td class="center ">1.7</td>
                                                    <td class="center ">A</td>
                                                </tr>
                                                <tr class="gradeA even">
                                                    <td class="sorting_1">Gecko</td>
                                                    <td class=" ">Firefox 1.5</td>
                                                    <td class=" ">Win 98+ / OSX.2+</td>
                                                    <td class="center ">1.8</td>
                                                    <td class="center ">A</td>
                                                </tr>
                                                <tr class="gradeA odd">
                                                    <td class="sorting_1">Gecko</td>
                                                    <td class=" ">Firefox 2.0</td>
                                                    <td class=" ">Win 98+ / OSX.2+</td>
                                                    <td class="center ">1.8</td>
                                                    <td class="center ">A</td>
                                                </tr>
                                                <tr class="gradeA even">
                                                    <td class="sorting_1">Gecko</td>
                                                    <td class=" ">Firefox 3.0</td>
                                                    <td class=" ">Win 2k+ / OSX.3+</td>
                                                    <td class="center ">1.9</td>
                                                    <td class="center ">A</td>
                                                </tr>
                                                <tr class="gradeA odd">
                                                    <td class="sorting_1">Gecko</td>
                                                    <td class=" ">Camino 1.0</td>
                                                    <td class=" ">OSX.2+</td>
                                                    <td class="center ">1.8</td>
                                                    <td class="center ">A</td>
                                                </tr>
                                                <tr class="gradeA even">
                                                    <td class="sorting_1">Gecko</td>
                                                    <td class=" ">Camino 1.5</td>
                                                    <td class=" ">OSX.3+</td>
                                                    <td class="center ">1.8</td>
                                                    <td class="center ">A</td>
                                                </tr>
                                                <tr class="gradeA odd">
                                                    <td class="sorting_1">Gecko</td>
                                                    <td class=" ">Netscape 7.2</td>
                                                    <td class=" ">Win 95+ / Mac OS 8.6-9.2</td>
                                                    <td class="center ">1.7</td>
                                                    <td class="center ">A</td>
                                                </tr>
                                                <tr class="gradeA even">
                                                    <td class="sorting_1">Gecko</td>
                                                    <td class=" ">Netscape Browser 8</td>
                                                    <td class=" ">Win 98SE+</td>
                                                    <td class="center ">1.7</td>
                                                    <td class="center ">A</td>
                                                </tr>
                                                <tr class="gradeA odd">
                                                    <td class="sorting_1">Gecko</td>
                                                    <td class=" ">Netscape Navigator 9</td>
                                                    <td class=" ">Win 98+ / OSX.2+</td>
                                                    <td class="center ">1.8</td>
                                                    <td class="center ">A</td>
                                                </tr>
                                                <tr class="gradeA even">
                                                    <td class="sorting_1">Gecko</td>
                                                    <td class=" ">Mozilla 1.0</td>
                                                    <td class=" ">Win 95+ / OSX.1+</td>
                                                    <td class="center ">1</td>
                                                    <td class="center ">A</td>
                                                </tr>
                                            </tbody>
                                            <tfoot>
                                                <tr>
                                                    <th rowspan="1" colspan="1">渲染引擎</th>
                                                    <th rowspan="1" colspan="1">浏览器</th>
                                                    <th rowspan="1" colspan="1">平台</th>
                                                    <th rowspan="1" colspan="1">引擎版本</th>
                                                    <th rowspan="1" colspan="1">CSS等级</th>
                                                </tr>
                                            </tfoot>
                                        </table>
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <div class="dataTables_info" id="editable_info" role="alert"
                                                    aria-live="polite" aria-relevant="all">显示 1 到 10 项，共
                                                    57 项</div>
                                            </div>
                                            <div class="col-sm-6">
                                                <div class="dataTables_paginate paging_simple_numbers"
                                                    id="editable_paginate">
                                                    <ul class="pagination">
                                                        <li class="paginate_button previous disabled"
                                                            aria-controls="editable" tabindex="0"
                                                            id="editable_previous"><a href="#">上一页</a></li>
                                                        <li class="paginate_button active"
                                                            aria-controls="editable" tabindex="0"><a href="#">1</a></li>
                                                        <li class="paginate_button " aria-controls="editable"
                                                            tabindex="0"><a href="#">2</a></li>
                                                        <li class="paginate_button " aria-controls="editable"
                                                            tabindex="0"><a href="#">3</a></li>
                                                        <li class="paginate_button " aria-controls="editable"
                                                            tabindex="0"><a href="#">4</a></li>
                                                        <li class="paginate_button " aria-controls="editable"
                                                            tabindex="0"><a href="#">5</a></li>
                                                        <li class="paginate_button " aria-controls="editable"
                                                            tabindex="0"><a href="#">6</a></li>
                                                        <li class="paginate_button next" aria-controls="editable"
                                                            tabindex="0" id="editable_next"><a href="#">下一页</a></li>
                                                    </ul>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>

               
			</div>
			<@h.fotter />
		</div>
		

	</div>

</body>
</html>
