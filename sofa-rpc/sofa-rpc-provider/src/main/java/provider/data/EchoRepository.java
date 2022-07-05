package provider.data;

import org.springframework.data.repository.CrudRepository;
import provider.data.po.EchoPO;

/**
 * author : liuanglin
 * date : 2022/7/4 18:59
 * description :
 */
public interface EchoRepository extends CrudRepository<EchoPO, Long> {}
