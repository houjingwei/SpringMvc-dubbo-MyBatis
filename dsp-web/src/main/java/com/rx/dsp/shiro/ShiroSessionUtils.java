package com.rx.dsp.shiro;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import com.dsp.model.User;

public class ShiroSessionUtils {

	public static final String USER_LOGIN = "user";

	public static void setAttribute(Object key, Object value) {
		Subject account = SecurityUtils.getSubject();
		if (null != account) {
			Session session = account.getSession();
			if (null != session) {
				session.setAttribute(key, value);
			}
		}
	}

	public static Object getAttribute(Object key) {
		Subject account = SecurityUtils.getSubject();
		if (null != account) {
			Session session = account.getSession();
			if (null != session) {
				return session.getAttribute(key);
			}
		}
		return null;
	}

	public static Object removeAttribute(Object key) {
		Subject account = SecurityUtils.getSubject();
		if (null != account) {
			Session session = account.getSession();
			if (null != session) {
				return session.removeAttribute(key);
			}
		}
		return null;
	}

	public boolean hasLogin() {
		return getAttribute(USER_LOGIN) != null ? true : false;
	}

	public static void setLoginUser(User user) {
		setAttribute(USER_LOGIN, user);
	}

	public static void setAsLogout() {
		removeAttribute(USER_LOGIN);
	}

	public static User getLoginUser() {
		return (User) getAttribute(USER_LOGIN);
	}

}
