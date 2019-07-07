def call (Closure timeout, Closure input) {
	def date = new Date()
	int dayOfTheWeek = date[Calendar.DAY_OF_WEEK]
	def hour = date.format('HH', TimeZone.getTimeZone('Europe/Berlin'))

	if (dayOfTheWeek == Calendar.FRIDAY || hour.toInteger() >= 16 ) {
		timeout (time: 15, unit: 'SECONDS') {
			input ('Validation is required')
		}
	}
}