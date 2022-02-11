package com.comac.test;

import java.util.List;
import java.util.Objects;

public class Scheduler {
    @Autowired(required=false)
    private SchedulerMapper schedulerMapper;
    private UserMapper userMapper;
    private int i2=Integer.parseInt(AdminLevel.ADMIN_LEVEL.getKey());

    public void  SchedulerTest(){
        List<User> users = schedulerMapper.queryAdminLevel();
        users.parallelStream().forEach(user ->{
            int i1 = Integer.parseInt(user.getAdminLevel());
            List<Admin> admins = schedulerMapper.queryempById(user.getId());
            if (!AdminLevel.ADMIN_LEVEL.getKey().equals(user.getAdminLevel())){
                Long id = user.getId();
                User user1 = findUser(id);
                admins.parallelStream().forEach(admin -> {
                    if (Objects.nonNull(user1) && !user1.getEcode().equals(admin.getCpcorgEcode())){
                        schedulerMapper.updateUser(user1.getId(),admin.getCpcEmpId());
                    }
                });
            }else if (i1==i2){
                admins.parallelStream().forEach(admin -> {
                    if (!user.getEcode().equals(admin.getCpcorgEcode())){
                        schedulerMapper.updateUser3(user.getId());
                    }
                });
            }
        });

    }
//8

    if(true){
        System.out.println(" jjk");
    }
    //34545354
    private  User findUser(Long userId){
        User user=userMapper.selectById(userId);
        if (user==null){
            return null;
        }
        if (AdminLevel.ADMIN_LEVEL.getKey().equals(user.getAdminLevel())){
            return user;
        }
        return findUser(user.getcpcorgupId());

    }

}
