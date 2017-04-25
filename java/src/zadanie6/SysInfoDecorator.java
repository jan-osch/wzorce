package zadanie6;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

public class SysInfoDecorator extends Decorator {

    public SysInfoDecorator(Task subject) {
        super(subject);
    }

    @Override
    void run() {
        System.out.println();
        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
        System.out.println("SysInfoDecorator:");
        this.subject.run();
        System.out.println("SysInfoDecorator: CPU load: " + osBean.getSystemLoadAverage());
    }
}
