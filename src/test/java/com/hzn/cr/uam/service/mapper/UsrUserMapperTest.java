package com.hzn.cr.uam.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class UsrUserMapperTest {

    private UsrUserMapper usrUserMapper;

    @BeforeEach
    public void setUp() {
        usrUserMapper = usrUserMapper.INSTANCE;
    }

    @Test
    public void testEntityFromId() {
        Integer id = 1;
        assertThat(usrUserMapper.fromUsrUid(id).getUsrUid()).isEqualTo(id);
        assertThat(usrUserMapper.fromUsrUid(null)).isNull();
    }
}
