package com.nt.niranjana.springmvc.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler 
{

	//@org.springframework.web.bind.annotation.ExceptionHandler({NullPointerException.class,NumberFormatException.class})
	@org.springframework.web.bind.annotation.ExceptionHandler(value=NullPointerException.class)
	public String exceptionHandlerNullPointer(Model model)
	{
		model.addAttribute("msg", "Null Pointer Exception");
		return "exceptionhandlerpage";
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(value=NumberFormatException.class)
	public String exceptionHandlerNumperFormatException(Model model)
	{
		model.addAttribute("msg", "Number Format Exception");
		return "exceptionhandlerpage";
	}
}
