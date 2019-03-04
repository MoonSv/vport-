package cn.vport.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.vport.domain.training.base.Course;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Namespace("/rest")
@ParentPackage("json-default")
@Controller
@Scope("prototype")
public class CourseAction extends ActionSupport implements ModelDriven<Course>{
	private Course course = new Course();
	@Override
	public Course getModel() {
		return course;
	}
	@Action(value="/course_save.action",results={@Result(name="success",type="json")})
	public String save(){
		System.out.println(course);
		ActionContext.getContext().getValueStack().push("aaa");
		return SUCCESS;
	}
}
