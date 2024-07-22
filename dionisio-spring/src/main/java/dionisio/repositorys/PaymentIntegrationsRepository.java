package dionisio.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dionisio.entities.PaymentIntegrations;

@Repository
public interface PaymentIntegrationsRepository extends JpaRepository<PaymentIntegrations, UUID> {

}
