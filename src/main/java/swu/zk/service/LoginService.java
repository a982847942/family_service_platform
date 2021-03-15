package swu.zk.service;

import swu.zk.bean.TblUserRecord;
import swu.zk.mapper.TblUserRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private TblUserRecordMapper tblUserRecordMapper;

    public TblUserRecord login(String username, String password){
        return tblUserRecordMapper.login(username,password);
    }
}
