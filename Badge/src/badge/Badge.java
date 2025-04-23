package badge;

public class Badge {
    private String badgeId;
    private String holderName;
    private String department;
    private boolean isActive;
    private int securityLevel;

    // Package-access setters
    void setBadgeId(String badgeId) {
        this.badgeId = badgeId;
    }

    void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    void setDepartment(String department) {
        this.department = department;
    }

    void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    void setSecurityLevel(int securityLevel) {
        this.securityLevel = securityLevel;
    }

    // Public getters
    public String getBadgeId() {
        return badgeId;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getDepartment() {
        return department;
    }

    public boolean isActive() {
        return isActive;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }
}