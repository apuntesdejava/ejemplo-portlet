package com.apuntesdejava.liferay.ejemplo.portlet;

import com.apuntesdejava.liferay.ejemplo.constants.EjemploPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author USER
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + EjemploPortletKeys.Ejemplo,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class EjemploPortlet extends MVCPortlet {
	private static final Log _log=LogFactoryUtil.getLog(EjemploPortlet.class);
	public void registrar(ActionRequest request,ActionResponse response) {
		String nombre=ParamUtil.getString(request, "nombre");
		_log.info("Este es el nombre:"+nombre);
		
		
	}
}