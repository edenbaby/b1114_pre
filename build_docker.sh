#!/bin/bash
NAMESPACE="${1:-codebase_b1114_app}"
docker build -t "$NAMESPACE" .