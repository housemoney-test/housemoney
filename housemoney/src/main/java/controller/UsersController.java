package controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import form.CreateUserForm;
import form.LoginUserForm;
import service.CreateUserService;
import service.LoginUserService;

@Controller
public class UsersController {

	@Autowired
	private CreateUserService createUserService;

	@Autowired
	private LoginUserService loginUserService;

	//ログイン画面
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("loginUserForm", new LoginUserForm());
		return "users/login";
	}

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("loginUserForm")LoginUserForm loginUserForm, 
			BindingResult result, Model model) {
		//パスが不一致の場合
		if () {
		return "users/login"

		}

		//パスが一致している場合

		return "users/login";
	}

	//新規登録
	@GetMapping("/signUp")
	public String create(Model model) {
		model.addAttribute("form", new CreateUserForm());
		return "users/signUp";
	}

	//ユーザー新規登録
	@PostMapping
	public String create(@Valid @ModelAttribute("form") CreateUserForm form,
			BindingResult result, Model model) {

		createUserService.create(form);
		return "redirect:/login";
	}

}
