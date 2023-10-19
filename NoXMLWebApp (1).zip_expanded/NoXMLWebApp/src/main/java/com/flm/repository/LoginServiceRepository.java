package com.flm.repository;

import com.entity.Adress;
import com.entity.User;

public interface LoginServiceRepository {
	
	
	void singUpUser(User user);

	void bookuser(Adress adress);

}
