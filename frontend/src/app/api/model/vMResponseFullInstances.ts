/**
 * Multicloud API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { VMResponseFullElasticInferenceAcceleratorAssociations } from './vMResponseFullElasticInferenceAcceleratorAssociations';
import { VMResponseFullCpuOptions } from './vMResponseFullCpuOptions';
import { VMResponseFullGroups } from './vMResponseFullGroups';
import { VMResponseFullHibernationOptions } from './vMResponseFullHibernationOptions';
import { VMResponseFullIamInstanceProfile } from './vMResponseFullIamInstanceProfile';
import { VMResponseFullLicenses } from './vMResponseFullLicenses';
import { KeyPairResponseFullTags } from './keyPairResponseFullTags';
import { VMResponseFullNetworkInterfaces } from './vMResponseFullNetworkInterfaces';
import { VMResponseFullStateReason } from './vMResponseFullStateReason';
import { VMResponseFullMonitoring } from './vMResponseFullMonitoring';
import { VMResponseFullState } from './vMResponseFullState';
import { VMResponseFullBlockDeviceMappings } from './vMResponseFullBlockDeviceMappings';
import { VMResponseFullElasticGpuAssociations } from './vMResponseFullElasticGpuAssociations';
import { VMResponseFullPlacement } from './vMResponseFullPlacement';
import { VMResponseFullCapacityReservationSpecification } from './vMResponseFullCapacityReservationSpecification';
import { VMResponseFullMetadataOptions } from './vMResponseFullMetadataOptions';
import { VMResponseFullProductCodes } from './vMResponseFullProductCodes';


export interface VMResponseFullInstances { 
    amiLaunchIndex?: number;
    architecture?: string;
    blockDeviceMappings?: Array<VMResponseFullBlockDeviceMappings>;
    capacityReservationId?: string;
    capacityReservationSpecification?: VMResponseFullCapacityReservationSpecification;
    clientToken?: string;
    cpuOptions?: VMResponseFullCpuOptions;
    ebsOptimized?: boolean;
    elasticGpuAssociations?: Array<VMResponseFullElasticGpuAssociations>;
    elasticInferenceAcceleratorAssociations?: Array<VMResponseFullElasticInferenceAcceleratorAssociations>;
    enaSupport?: boolean;
    hibernationOptions?: VMResponseFullHibernationOptions;
    hypervisor?: string;
    iamInstanceProfile?: VMResponseFullIamInstanceProfile;
    imageId?: string;
    instanceId?: string;
    instanceLifecycle?: string;
    instanceType?: string;
    kernelId?: string;
    keyName?: string;
    launchTime?: string;
    licenses?: Array<VMResponseFullLicenses>;
    metadataOptions?: VMResponseFullMetadataOptions;
    monitoring?: VMResponseFullMonitoring;
    networkInterfaces?: Array<VMResponseFullNetworkInterfaces>;
    outpostArn?: string;
    placement?: VMResponseFullPlacement;
    platform?: string;
    privateDnsName?: string;
    privateIpAddress?: string;
    productCodes?: Array<VMResponseFullProductCodes>;
    publicDnsName?: string;
    publicIpAddress?: string;
    ramdiskId?: string;
    rootDeviceName?: string;
    rootDeviceType?: string;
    securityGroups?: Array<VMResponseFullGroups>;
    sourceDestCheck?: boolean;
    spotInstanceRequestId?: string;
    sriovNetSupport?: string;
    state?: VMResponseFullState;
    stateReason?: VMResponseFullStateReason;
    stateTransitionReason?: string;
    subnetId?: string;
    tags?: Array<KeyPairResponseFullTags>;
    virtualizationType?: string;
    vpcId?: string;
}
