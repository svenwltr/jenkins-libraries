def call() {
	return sh(
		script: '''#!/bin/bash
			git rev-parse --short HEAD
		''',
		returnStdout: true,
	).trim()
}
