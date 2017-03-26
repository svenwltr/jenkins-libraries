def call(repo) {
	return sh(
		script: """curl -s \
			-H "Accept: application/vnd.github.v3+json" \
			"https://api.github.com/repos/${repo}/releases/latest" \
			| jq '.tag_name' -r""",
		returnStdout: true,
		label: "get latest GitHub release"
	).trim()
}
