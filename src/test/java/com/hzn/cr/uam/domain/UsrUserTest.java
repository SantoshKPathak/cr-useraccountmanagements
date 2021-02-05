package com.hzn.cr.uam.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.hzn.cr.uam.web.rest.TestUtil;

public class UsrUserTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(UsrUser.class);
        UsrUser usrUser1 = new UsrUser();
        usrUser1.setUsrUid(1);
        UsrUser usrUser2 = new UsrUser();
        usrUser2.setUsrUid(usrUser1.getUsrUid());
        assertThat(usrUser1).isEqualTo(usrUser2);
        usrUser2.setUsrUid(2);
        assertThat(usrUser1).isNotEqualTo(usrUser2);
        usrUser1.setUsrUid(null);
        assertThat(usrUser1).isNotEqualTo(usrUser2);
    }
}
