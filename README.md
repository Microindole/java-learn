# java-learn
```
BFSTraversal(G, V):
  创建一个布尔数组 visited[V]，初始化为 false
  for i 从 0 到 V-1:
    if visited[i] == false:
      BFS(G, i, visited) // 调用下面的单次BFS过程

BFS(G, startNode, visited):
  创建一个队列 Q
  visited[startNode] = true
  Q.enqueue(startNode)

  while Q is not empty:
    u = Q.dequeue()
    // 在这里处理顶点 u，例如打印
    print u

    for v 从 0 到 V-1: // 对于邻接矩阵，检查所有可能的邻居
      if G.adjMatrix[u][v] == 1 AND visited[v] == false:
        visited[v] = true
        Q.enqueue(v)
```