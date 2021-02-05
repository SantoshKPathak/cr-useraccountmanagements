package com.hzn.cr.uam.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.hzn.cr.uam.web.rest.TestUtil;

public class UsrUserDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(UsrUserDTO.class);
        UsrUserDTO usrUserDTO1 = new UsrUserDTO();
        usrUserDTO1.setUsrUid(1);
        UsrUserDTO usrUserDTO2 = new UsrUserDTO();
        assertThat(usrUserDTO1).isNotEqualTo(usrUserDTO2);
        usrUserDTO2.setUsrUid(usrUserDTO1.getUsrUid());
        assertThat(usrUserDTO1).isEqualTo(usrUserDTO2);
        usrUserDTO2.setUsrUid(2);
        assertThat(usrUserDTO1).isNotEqualTo(usrUserDTO2);
        usrUserDTO1.setUsrUid(null);
        assertThat(usrUserDTO1).isNotEqualTo(usrUserDTO2);
    }
}
