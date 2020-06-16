package it.dstech.formazione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerOperazioni {
	@RequestMapping(value = "/operazioni", method = RequestMethod.POST)
	public ModelAndView operazioni(@RequestParam("operazione") String operazione, Model model) {
		return new ModelAndView("numeri", "operazione", operazione);
	}

	@RequestMapping(value = "/risultato", method = RequestMethod.POST)
	public ModelAndView risultato(@RequestParam("numeroUno") int numeroUno, @RequestParam("numeroDue") int numeroDue,
			@RequestParam("operazione") String operazione, Model model) {
		double risultato = 0;
		switch (Integer.parseInt(operazione)) {
		case 0:
			risultato = numeroUno + numeroDue;
			break;
		case 1:
			risultato = numeroUno - numeroDue;
			break;
		case 2:
			risultato = numeroUno * numeroDue;
			break;
		case 3:
			risultato = numeroUno / numeroDue;
			break;

		}
		return new ModelAndView("fine", "risultato", risultato);
	}
}