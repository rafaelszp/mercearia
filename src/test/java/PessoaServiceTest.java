import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.component.test.mixins.cdi.CDIMixIn;
import org.switchyard.test.Invoker;
import org.switchyard.test.ServiceOperation;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;
import org.switchyard.test.SwitchYardTestKit;

import com.example.mercearia.Pessoa;


@RunWith(SwitchYardRunner.class)
@SwitchYardTestCaseConfig(config = SwitchYardTestCaseConfig.SWITCHYARD_XML, mixins = {
		CDIMixIn.class }, exclude="rest")
public class PessoaServiceTest {

	private SwitchYardTestKit testKit;
	private CDIMixIn cdiMixIn;
	@ServiceOperation("PessoaService")
	private Invoker service;

	@Test
	public void testGravar() throws Exception {
		// TODO Auto-generated method stub
		// initialize your test message
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Pessoa enviada via SOAP");
		pessoa.setIdade(33);
		service.operation("gravar").sendInOnly(pessoa);

	}

}
