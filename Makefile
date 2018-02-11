help:
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | sort | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}'

run: ## Run the application
	lein clean
	lein figwheel dev

test: ## Run tests
	lein clean
	lein doo node test once

auto_test: ## Run the tests every time the code changes
	lein clean
	lein doo node test auto