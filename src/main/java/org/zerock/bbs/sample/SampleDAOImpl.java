package org.zerock.bbs.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Qualifier("normal")
@Repository
public class SampleDAOImpl implements SampleDAO
{

}
