package config;

import com.duda.odata.jpa.ODataJpaExecutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Long>, ODataJpaExecutor<TestEntity> {}
