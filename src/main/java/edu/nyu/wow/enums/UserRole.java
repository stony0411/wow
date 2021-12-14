package edu.nyu.wow.enums;

/**
 * @Author: sw3455
 * @Date: 2021/12/14
 * @Email: sw3455@nyu.edu
 */
public enum UserRole {
    ADMIN(0, "ADMIN"),
    PATIENT(1,"PATIENT"),
    DOCTOR(2,"DOCTOR");

    private final Integer roleId;
    private final String roleName;

    UserRole(Integer roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public String getRoleName() {
        return roleName;
    }
}
