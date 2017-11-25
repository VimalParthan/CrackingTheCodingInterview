import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class App {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String projectsString = in.readLine();

		String[] projects = projectsString.split(", ");

		List<Node> nodes = createProjectNodes(projects);

		String dependenciesString = in.readLine();

		String[] dependencies = dependenciesString.split("\\), ");

		addDependenciesToNodes(nodes, dependencies);

		TopologicalOrdering to = new TopologicalOrdering();

		to.dfs(nodes);

		if (!to.hasCyclicDependency) {

			Stack<Node> orderedNodes = to.topologicalOrder();

			while (!orderedNodes.isEmpty()) {
				System.out.println(orderedNodes.pop().getData());
			}

		}else {
			System.out.println("has cyclic dependency");
		}
	}

	private static void addDependenciesToNodes(List<Node> nodes, String[] dependencies) {

		for (String dependency : dependencies) {

			Node node = new Node(dependency.trim().substring(1, 2));

			Node node2 = new Node(dependency.trim().substring(4, 5));

			nodes.get(nodes.indexOf(node)).addAjacentNode(nodes.get(nodes.indexOf(node2)));
		}

	}

	private static List<Node> createProjectNodes(String[] projects) {
		List<Node> nodes = new ArrayList<>();
		Node node = null;

		for (String project : projects) {
			node = new Node(project.trim());
			nodes.add(node);
		}

		return nodes;
	}

}
