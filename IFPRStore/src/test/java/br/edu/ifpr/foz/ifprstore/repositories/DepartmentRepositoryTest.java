package br.edu.ifpr.foz.ifprstore.repositories;
import br.edu.ifpr.foz.ifprstore.models.Department;
import org.junit.jupiter.api.Test;



import java.util.List;

public class DepartmentRepositoryTest {
    @Test
    public void deveInserirUmDepartamento() {
        DepartmentRepository repository = new DepartmentRepository();
        Department departmentFake = new Department();
        departmentFake.setName("Fake Department");
        repository.insert(departmentFake);
    }
    @Test
    public void deveDeletarUmDepartamentoPeloId() {
        DepartmentRepository repository = new DepartmentRepository();
        repository.delete(5);
    }
    @Test
    public void deveAtualizarONomeDepartamentoPeloId() {
        DepartmentRepository repository = new DepartmentRepository();
        String name = "testeBooks";
        repository.updateDepartment(6,name);
    }
    @Test
    public void deveExibirUmaListaDeDepartments(){
        DepartmentRepository repository = new DepartmentRepository();
        List<Department> department = repository.getDepartments();
        for(Department d : department){
            System.out.println(d);
        }
    }
    @Test
    public void deveExibirUmDepartamentoPeloId(){
        DepartmentRepository repository = new DepartmentRepository();
        Department department = repository.getDepartmentById(6);
        System.out.println(department);
    }
    @Test
    public void deveFiltrarDepartamentosPorUmaString(){
        DepartmentRepository repository = new DepartmentRepository();
        List<Department> department = repository.getFilter("books");
        System.out.println(department);
    }
    @Test
    public void deveRetornarDepartamentosSemSellers(){
        DepartmentRepository repository = new DepartmentRepository();
        List<Department> department = repository.getNoSellers();
        System.out.println(department);
    }
}
