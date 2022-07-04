package provider.data.po;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * author : liuanglin
 * date : 2022/7/4 18:56
 * description :
 */
@Entity
@Data
public class EchoInfo {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String info;
}
