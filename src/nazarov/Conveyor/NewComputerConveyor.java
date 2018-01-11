package nazarov.Conveyor;

import nazarov.Interfaces.Computer;
import nazarov.Interfaces.ComputerConveyor;

public abstract class NewComputerConveyor implements ComputerConveyor {
    @Override
    public abstract Computer createComputer();
}
