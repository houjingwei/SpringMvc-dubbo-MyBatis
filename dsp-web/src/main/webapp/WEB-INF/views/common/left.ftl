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
			
			<#if (roles?? && roles?size>0)>
				<#list roles as role>
					<li>
						<@shiro.hasRole name="${role.rName!''}">
							<a href="#"> <span class="nav-label">${role.rRemark!''}</span> <span class="fa arrow"></span> </a>
						 </@shiro.hasRole> 
						 <#if role.pList??>
						<ul class="nav nav-second-level">
						    <#list role.pList as p>
						    	<@shiro.hasPermission  name="${p.pName!''}">
									<li><a class="J_menuItem" href="index_v1.html" data-index="0">${p.pRemark!''}</a></li>
								</@shiro.hasPermission>
							</#list>
						</ul>
						</#if>
					</li>
				</#list>
			</#if>
			
			
		</ul>
	</div>
</nav>
