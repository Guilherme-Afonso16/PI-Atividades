package ifrn.pi.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.eventos.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
