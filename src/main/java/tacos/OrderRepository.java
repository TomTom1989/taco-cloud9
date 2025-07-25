package tacos;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import tacos.TacoOrder;
import tacos.User;
public interface OrderRepository extends ReactiveCrudRepository<TacoOrder, String> {

}
