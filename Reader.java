public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
		
//добавляем операцию проверки введенных данных
		try{

//создаем условие при котором будет выполнятся данный слушатель
			if(e.getSource()==button1){


//вывод в ответ результата и его округление
				a = "Ответ: " +(double)Math.round(y*100)/100 +" кв.м.  Осталость места: "+ x+" кв.м.";
				label.setText(a);
			}
//выводим сообщение о вводе неправильных данных
		}catch (Exception ex){JOptionPane.showMessageDialog(null,"Вы что-то ввели не так");}
		}
