package org.mw.wfpsm.service;

import org.mw.wfpsm.param.LoginRequest;
import org.mw.wfpsm.param.LoginResponse;

public interface SystemManageService {

	LoginResponse login(LoginRequest loginRequest);

}
