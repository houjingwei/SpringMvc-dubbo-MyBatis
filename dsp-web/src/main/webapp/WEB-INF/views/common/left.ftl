<nav class="navbar-default navbar-static-side" role="navigation">
	<div class="nav-close">
		<i class="fa fa-times-circle"></i>
	</div>
	<div class="sidebar-collapse">
		<ul class="nav" id="side-menu">
			<li class="nav-header">
				<div class="dropdown profile-element">
					<img alt="image" class="img-circle " src="${user.photo!''}"
						style="width: 72px; height: 72px; margin-bottom: 5px;" /> <a
						data-toggle="dropdown" class="dropdown-toggle" href="#"> <span
						class="clear"> <span class="block">
							<strong class="font-bold" style="font-size: 15px;">
							<@shiro.hasRole manager></@shiro.hasRole>
								<@shiro.guest>
								    欢迎游客访问，<a href="${path}/login.jsp">点击登录</a><br/>
								</@shiro.guest>
								
								<@shiro.user>
								    欢迎[${user.username!''}]登录，<a href="${path}/logout">点击退出</a><br/>
								</@shiro.user>
							</strong></span> 
					</span>
					</a>
					
					<ul class="dropdown-menu animated fadeInRight m-t-xs">
						<li><a class="J_menuItem" href="form_avatar.html">修改头像</a></li>
						<li><a class="J_menuItem" href="profile.html">个人资料</a></li>
						<li><a class="J_menuItem" href="contacts.html">联系我们</a></li>
						<li><a class="J_menuItem" href="mailbox.html">信箱</a></li>
						<li class="divider"></li>
						<li><a href="${path }/logout">安全退出</a></li>
					</ul>
				</div>
				<div class="logo-element">H+</div>
			</li>
			<li><a href="#"> <i class="fa fa-home"></i> <span
					class="nav-label">主页</span> <span class="fa arrow"></span>
			</a>
				<ul class="nav nav-second-level">
					<li><a class="J_menuItem" href="index_v1.html" data-index="0">用户列表</a></li>
					<li><a class="J_menuItem" href="index_v2.html">主页示例二</a></li>
					<li><a class="J_menuItem" href="index_v3.html">主页示例三</a></li>
					<li><a class="J_menuItem" href="index_v4.html">主页示例四</a></li>
					<li><a href="index_v5.html" target="_blank">主页示例五</a></li>
				</ul></li>


			<li><a href="mailbox.html"><i class="fa fa-envelope"></i> <span
					class="nav-label">信箱 </span><span
					class="label label-warning pull-right">16</span></a>
				<ul class="nav nav-second-level">
					<li><a class="J_menuItem" href="mailbox.html">收件箱</a></li>
					<li><a class="J_menuItem" href="mail_detail.html">查看邮件</a></li>
					<li><a class="J_menuItem" href="mail_compose.html">写信</a></li>
				</ul></li>
		</ul>
	</div>
</nav>
