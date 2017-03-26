def call(String repo) {
	def z = new com.github.jenkinslibraries.Bar()
	z.checkOutFrom(repo)
}
