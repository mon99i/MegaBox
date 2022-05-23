package service;
import java.sql.SQLException;

import dao.*;
import model.CustomerDTO;
import model.*;

//ȸ������ ó�� ���
public class SignUpService {
	public void signUp(String ID, String password, String email, String phone) {
		//CustomerDTO ��ü ����
		CustomerDTO customerDTO = new CustomerDTO(ID, PasswordEncryptService.passwordEncrypt(password), email, phone, 1, 0);
		
		//DAO �޼ҵ忡 DTO getter �޼ҵ�� �� �Է�
		try {
			SignUpDAO.register(customerDTO.getID(), customerDTO.getPassword(), customerDTO.getEmail(), customerDTO.getEmail(), customerDTO.getRole(), customerDTO.getReview_count());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}