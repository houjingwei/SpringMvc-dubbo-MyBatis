package com.rx.dsp.shiro.tag;

import java.io.IOException;
import java.util.List;

import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.jagregory.shiro.freemarker.ShiroTags;

import freemarker.cache.TemplateLoader;
import freemarker.ext.jsp.TaglibFactory;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;

public class ShiroFreemarkerTagConfigurer extends FreeMarkerConfigurer{
    //@Override
    public void afterPropertiesSet() throws IOException, TemplateException
    {
        super.afterPropertiesSet();
        this.getConfiguration().setSharedVariable("shiro", new ShiroTags());
    }
}
