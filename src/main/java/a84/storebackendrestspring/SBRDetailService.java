package a84.storebackendrestspring;

import a84.storebackendrestspring.m.daos.QuizzUserDAO;
import a84.storebackendrestspring.m.objects.QuizzUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SBRDetailService implements UserDetailsService {

    @Autowired
    QuizzUserDAO quizzUserDAO;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        QuizzUser u = quizzUserDAO.findByUserName(userName);
        if (u == null) {
            throw new UsernameNotFoundException("Not found: " + userName);
        }
        return new SBRUserDetails(u);
    }

}











