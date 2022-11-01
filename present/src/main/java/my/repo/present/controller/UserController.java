package my.repo.present.controller;

import my.repo.api.base.RestResponse;
import my.repo.api.service.RestUserService;
import my.repo.api.user.input.RestUserCommand;
import my.repo.api.user.output.UserOutput;
import my.repo.business.service.UserServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController implements RestUserService {

    @Autowired
    private UserServcie userServcie;

    @PostMapping("/insert")
    @Override
    public RestResponse<UserOutput> insertUser(@RequestBody RestUserCommand restUserCommand){
        return userServcie.insertUser(restUserCommand);
    }
}
