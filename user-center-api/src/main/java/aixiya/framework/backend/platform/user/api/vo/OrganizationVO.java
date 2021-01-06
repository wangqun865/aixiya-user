package aixiya.framework.backend.platform.user.api.vo;

import lombok.Data;

import java.util.List;


@Data
public class OrganizationVO {
    private String id;
    private String name;
    private String ssopId;
    private List<OrganizationVO> cOrgs;
}
