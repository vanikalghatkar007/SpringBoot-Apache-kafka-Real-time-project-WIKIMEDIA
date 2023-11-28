package upskill.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upskill.ms.entity.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData,Long> {
}
