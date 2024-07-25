package dionisio.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dionisio.entities.MarketingIntegrations;

@Repository
public interface MarketingIntegrationsRepository extends JpaRepository<MarketingIntegrations, UUID> {

}
