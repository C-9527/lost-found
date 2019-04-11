package cpwu.ecut.service.dto.req;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

/**
 * lost-found
 * cpwu.ecut.service.dto.req
 *
 * @author BlueDriver
 * @email cpwu@foxmail.com
 * @date 2019/04/11 14:53 Thursday
 */
@Data
@Validated
public class CategoryAddReq {
    /**
     * 类型名
     */
    @NotBlank(message = "类型名称不能为空空")
    private String name;
    /**
     * 说明
     */
    private String about;
    /**
     * 图标
     */
//    private String image;
    /**
     * 创建人id
     */
//    private String creatorId;
    /**
     * 创建时间
     */
//    private Date createTime;
    /**
     * 级别类型：0：系统级别, 1：校园级别, 2：校区级别
     *
     * @see cpwu.ecut.common.constant.enums.LevelEnum
     */
//    private Integer level;
    /**
     * 作用对象id系统级别为“system”
     */
//    private String targetId;
}