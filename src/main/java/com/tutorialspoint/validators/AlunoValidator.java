package com.tutorialspoint.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.tutorialspoint.models.Aluno;

public class AlunoValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Aluno.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object targets, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nome", "required.nome", "Campo nome é obrigatório!");
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "idade", "required.idade", "Campo idade é obrigatório!");
		ValidationUtils.rejectIfEmpty(errors,  "idade", "required.idade", "Campo idade é obrigatório!");
	}

}
